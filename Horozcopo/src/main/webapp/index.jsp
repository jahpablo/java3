<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horozcopo</title>
    </head>
    <body>
   <h1>Consulta tu horoscopo</h1>
        <form action="ServletHoroscopo" method="get">
            <p>Entérate de lo que te deparan las estrellas</p>            
            <select name="Signo">
                <option>Virgo</option>
                <option>Sagitario</option>
                <option>Libra</option>
                <option>Acuario</option>
                <option>Piscis</option>
                <option>Aries</option>
                <option>Tauro</option>
                <option>Geminis</option>
                <option>Escorpion</option>
                <option>Capricornio</option>
                <option>Cancer</option>
                <option>Leo</option>
            </select>
            <input type="submit" value="enviar" />
        </form>
    </body>
</html>
