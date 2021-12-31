import axios from 'axios';

export const authServiceAPI = axios.create({
    baseURL: 'http://localhost:5353/auth'
})

export const commonServiceAPI = axios.create({
    baseURL: 'http://localhost:5353/products'
})

export const searchSuggestionServiceAPI = axios.create({
    baseURL: 'http://localhost:5353/suggestion'
})