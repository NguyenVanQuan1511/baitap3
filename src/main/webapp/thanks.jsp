<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Thank You</title>
</head>
<body>
    <h1>Thanks for filling out our survey!</h1>
    <p>Here is the information you entered:</p>
    <ul>
        <li>First Name: ${firstName}</li>
        <li>Last Name: ${lastName}</li>
        <li>Email: ${email}</li>
        <li>Date of Birth: ${dob}</li>
        <li>Heard about us: ${hearAbout}</li>
        <li>Receive News: ${receiveNews}</li>
        <li>Receive Email Announcements: ${receiveEmail}</li>
        <li>Preferred Contact Method: ${contactMethod}</li>
    </ul>
</body>
</html>
