package data

import domain.entities.Interest
import domain.entities.MemberOfParliament
import domain.repository.IMembersRepository

class ApiMemberRepository() : IMembersRepository {

    override fun findInterestsByMp(member: MemberOfParliament): List<Interest> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findMpByPostCode(postCode: String): MemberOfParliament {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}