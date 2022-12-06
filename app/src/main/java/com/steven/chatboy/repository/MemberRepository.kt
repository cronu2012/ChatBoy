package com.steven.chatboy.repository

import com.steven.chatboy.model.Member

class MemberRepository {
   private val memberList = listOf<Member>(Member(
       id = 1,
       name = "Amy",
       age = 17,
       email = "amy0011@yahoo.com.tw"
       ),
       Member(
           id = 2,
           name = "Frank",
           age = 34,
           email = "frkkk12@yahoo.com.tw"
       ),
       Member(
           id = 3,
           name = "Kenny",
           age = 23,
           email = "kennt2001@gmail.com"
       ),
       Member(
           id = 4,
           name = "Grace",
           age = 29,
           email = "grababy2022@yahoo.com.tw"
       ),
       Member(
           id = 5,
           name = "Willy",
           age = 31,
           email = "willyww@hotmail.com"
       ),
       Member(
           id = 6,
           name = "Vivan",
           age = 41,
           email = "viviii@gmail.com"
       ),
       Member(
           id = 7,
           name = "Tim",
           age = 30,
           email = "tim1995@yahoo.com.tw"
       ),
       Member(
           id = 8,
           name = "Derek",
           age = 28,
           email = "dede20220102@gmail.com"
       ),
       Member(
           id = 9,
           name = "Marcus",
           age = 19,
           email = "marmar2004@yahoo.com.tw"
       ),
       Member(
           id = 10,
           name = "Jerry",
           age = 37,
           email = "jey2901@hotmail.com"
       )
   )



   fun getAll():List<Member>{
       return  memberList
   }
}