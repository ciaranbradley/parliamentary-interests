package domain.entities

data class MemberOfParliament(val firstname: String,
                              val surname: String,
                              val constituency: String,
                              val interests: List<Interest>)