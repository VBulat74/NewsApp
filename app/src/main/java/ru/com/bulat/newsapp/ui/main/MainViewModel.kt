package ru.com.bulat.newsapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.com.bulat.newsapp.data.api.NewsRepository
import ru.com.bulat.newsapp.models.NewsResponse
import ru.com.bulat.newsapp.utils.Resource
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: NewsRepository): ViewModel() {
    val newsLiveData : MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var newsPage = 1

    init {
        getNews(countryCode = "us")
    }

    private fun getNews (countryCode : String) =
        viewModelScope.launch {
            newsLiveData.postValue(Resource.Loading())
            val response = repository.getNews(countryCode, newsPage)
            if (response.isSuccessful) {
                response.body().let {res ->
                    newsLiveData.postValue(Resource.Success(res))
                }
            } else {
                newsLiveData.postValue(Resource.Error(response.message()))
            }
        }
}