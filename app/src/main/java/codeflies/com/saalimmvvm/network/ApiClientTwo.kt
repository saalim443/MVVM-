package codeflies.com.saalimmvvm.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory


object ApiClientTwo {
    //  private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private const val BASE_URL = "https://marketplaceaws.waayupro.in/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }

    val apiInterface: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}