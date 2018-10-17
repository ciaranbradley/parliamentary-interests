package domain

import functional.Either
import exception.Failure
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch


abstract class BaseUseCase<out Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Either<Failure, Type>

    //operator fun invoke(params: Params, onResult: (Either<Failure, Type>) -> Unit = {}) {
    //    val job = async(CommonPool) { run(params) }
    //    launch(UI) { onResult(job.await()) }
    //}

    class None
}
