package domain.repository

import domain.entities.Interest
import domain.entities.MemberOfParliament

interface IMembersRepository {

    fun findInterestsByMp(member: MemberOfParliament): List<Interest>

    fun findMpByPostCode(postCode: String): MemberOfParliament

}