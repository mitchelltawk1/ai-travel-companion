// userExists.test.js
describe('User Existence Check', () => {
    test('returns true for existing user by name', () => {
      const users = [{ name: 'John Doe', id: 123 }];
      const userExists = (name) => users.some(user => user.name === name);

      const result = userExists('John Doe');
      expect(result).toBe(true);
    });

    test('returns false for non-existent user', () => {
      const users = [{ name: 'John Doe', id: 123 }];
      const userExists = (name) => users.some(user => user.name === name);

      const result = userExists('Jane Doe');
      expect(result).toBe(false);
    });
  });
