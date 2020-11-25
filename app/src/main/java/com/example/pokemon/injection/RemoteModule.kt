package com.example.pokemon.injection

import com.example.datasource.RemoteDataSource
import com.example.pokemon.BuildConfig
import com.example.pokemon.api.PokemonApi
import com.example.pokemon.datasource.RemoteDataSourceImpl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val remoteModule = module {


    single { provideDefaultOkhttpClient(get()) }
    factory { provideForecastApi(get()) }
    single { provideRetrofit(get()) }

}


fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl(BuildConfig.API_URL).client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create()).build()
}

fun provideDefaultOkhttpClient(authInterceptor: AuthInterceptor): OkHttpClient {

    return OkHttpClient().newBuilder().addInterceptor(authInterceptor).build()
}

fun provideForecastApi(retrofit: Retrofit): PokemonApi = retrofit.create(PokemonApi::class.java)


class AuthInterceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var req = chain.request()
        //val url = req.url.newBuilder().addQueryParameter("APPID", "your_key_here").build()
        //req = req.newBuilder().url(url).build()
        return chain.proceed(req)
    }
}