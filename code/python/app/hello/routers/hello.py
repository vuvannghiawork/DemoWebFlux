from fastapi import APIRouter
from fastapi import Depends
from loguru import logger


from app.hello.schema.hello import HelloNameResponse
from app.hello.services.hello import generate_hello_name


hello_router = APIRouter(prefix="/hello", tags=["hello"])


@hello_router.get(
    '',
    response_model=HelloNameResponse,
    description="Hello name",
)
async def hello_name() -> HelloNameResponse:
    """
    Generate a random name, in Vietnamese.

    Returns:
        HelloNameResponse
    """
    logger.info("Request hello name")

    result = await generate_hello_name()

    return HelloNameResponse(
        success=True,
        message="Hello name success",
        data=result
    )
