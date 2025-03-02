from loguru import logger
import time
from faker import Faker


async def generate_hello_name():
    """
    Generate a random Vietnamese name.

    This function sleeps for 5 seconds, then uses the Faker library to
    generate a random Vietnamese name. The name is then returned as a
    string with the greeting "Hello " prepended.

    Returns:
        str: A random Vietnamese name with a greeting.
    """
    logger.info("Generate hello name")

    time.sleep(5)
    fake = Faker('vi_VN')
    name = fake.name()

    return f"Hello {name}"
