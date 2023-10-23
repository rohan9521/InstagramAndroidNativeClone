package com.example.instagramandroidnativeclone.utils

sealed class Screen(val route:String){
    object Auth:Screen(AUTH_SCREEN){
        object LoginScreen:Screen(LOGIN_SCREEN)
        object SignUpScreen:Screen(SIGN_UP_SCREEN)
    }
    object Home:Screen(HOME){
        object HomeScreen:Screen(HOME_SCREEN)
        object SearchScreen:Screen(SEARCH_SCREEN)
        object ProfileScreen:Screen(PROFILE_SCREEN)
        object ExploreScreen:Screen(EXPLORE_SCREEN)
        object ChatScreen:Screen(CHAT_SCREEN){
            object ChatListScreen:Screen(CHAT_LIST_SCREEN)
            object ChatRoomScreen:Screen(CHAT_ROOM_SCREEN)
        }
        object CreateContent:Screen(CREATE_SCREEN)
    }
}
