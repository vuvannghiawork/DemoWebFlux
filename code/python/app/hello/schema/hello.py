from pydantic import BaseModel


class BaseResponse(BaseModel):
    success: bool
    message: str
    data: object


class HelloNameResponse(BaseResponse):
    pass
