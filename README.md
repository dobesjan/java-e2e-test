# Project structure

## core
Wrapper under selenium framework. Setup test runs according to configuration.

### Classes
- TestDriver - abstraction under selenium WebDriver and WebDriverWait
- TestExecutor - used for test initialization

## pages
Pages objects.

## components
UI Components objects.

# Test run configuration

{
  "baseUrl": "https://automationtesting.co.uk/",
  "wait": 30,
  "browserOptions": [
    {
      "browserName": "chrome",
      "options": [
        "--disable-extensions",
        "--incognito",
        "--start-maximized",
        "--disable-popup-blocking"
      ]
    },
    {
      "browserName": "firefox",
      "options": [
        "-private",
        "-disable-web-security"
      ]
    }
  ]
}

