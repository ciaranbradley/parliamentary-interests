package domain.usecases

import domain.entities.MemberOfParliament
import domain.repository.IMembersRepository

class FindMpByPostcodeUseCase(private val memberRepository: IMembersRepository) {

    fun findMp(postcode: String): MemberOfParliament {
        return memberRepository.findMpByPostCode(postcode)
    }

}