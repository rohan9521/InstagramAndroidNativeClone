package com.example.instagramandroidnativeclone.utils

sealed class Screen(val route:String){
    object Auth:Screen(AUTH_SCREEN){
        object LoginScreen:Screen(LOGIN_SCREEN)
        object SignUpScreen:Screen(SIGN_UP_SCREEN)
    }
    object Home:Screen(HOME){
        object HomeScreen:Screen(HOME_SCREEN){
            object HomeMainScreen:Screen(HOME_MAIN_SCREEN)
        }
        object Search:Screen(SEARCH_SCREEN)
        object Profile:Screen(PROFILE_SCREEN){
            object ProfileMainScreen:Screen(POFILE_MAIN_SCREEN)
        }
        object Explore:Screen(EXPLORE_SCREEN){
            object ExploreMainScreen:Screen(EXPLORE_MAIN_SCREEN)
        }
        object Chat:Screen(CHAT_SCREEN){
            object ChatListScreen:Screen(CHAT_LIST_SCREEN)
            object ChatRoomScreen:Screen(CHAT_ROOM_SCREEN)
        }
        object CreateContent:Screen(CREATE_SCREEN){
            object CreateContentMainScreen:Screen(CREATE_CONTENT_MAIN_SCREEN)
        }
    }
}
