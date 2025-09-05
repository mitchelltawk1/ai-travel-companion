import unittest

class TestUserExists(unittest.TestCase):
    def test_returns_true_for_existing_user_by_name(self):
        users = [{'name': 'John Doe', 'id': 123}]
        def user_exists(name):
            return any(user['name'] == name for user in users)

        result = user_exists('John Doe')
        self.assertTrue(result)

    def test_returns_false_for_non_existent_user(self):
        users = [{'name': 'John Doe', 'id': 123}]
        def user_exists(name):
            return any(user['name'] == name for user in users)

        result = user_exists('Jane Doe')
        self.assertFalse(result)

if name == 'main':
    unittest.main()
