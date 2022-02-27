fun main()
{
    var H: Int
    var M: Int
    var S: Int

    println("Ingrese la cantidad de horas: ")
    H = readLine()!!.toInt()
    do
    {
        println("Ingrese la cantidad de minutos: ")
        M = readLine()!!.toInt()

        if (M > 59)
        {
            println("Los minutos ingresados no deben ser mayores a 59")
        }
    } while (M > 59)
    do
    {
        println("Ingrese la cantidad de segundos: ")
        S = readLine()!!.toInt()

        if (S > 59)
        {
            println("Los segundos ingresados no deben ser mayores a 59")
        }
    } while (S > 59)

    for (i in 0..H)
    {
        if (i == H)
        {
            for(j in 0 .. M)
            {
                if (j == M)
                {
                    for (k in 0..S)
                    {
                        if (i <=9 && j <=9 && k <=9)
                        {
                            println("0$i:0$j:0$k")
                        }
                        if (i <=9 && j <=9 && k >9)
                        {
                            println("0$i:0$j:$k")
                        }
                        if (i <=9 && j >9 && k <=9)
                        {
                            println("0$i:$j:0$k")
                        }
                        if (i <=9 && j >9 && k >9)
                        {
                            println("0$i:$j:$k")
                        }
                        if (i >9 && j <=9 && k <=9)
                        {
                            println("$i:0$j:0$k")
                        }
                        if (i >9 && j <=9 && k >9)
                        {
                            println("$i:0$j:$k")
                        }
                        if (i >9 && j >9 && k <=9)
                        {
                            println("$i:$j:0$k")
                        }
                        if (i >9 && j >9 && k >9)
                        {
                            println("$i:$j:$k")
                        }
                        Thread.sleep(1000)
                    }
                }
                else
                {
                    for (k in 0..59)
                    {
                        if (i <=9 && j <=9 && k <=9)
                        {
                            println("0$i:0$j:0$k")
                        }
                        if (i <=9 && j <=9 && k >9)
                        {
                            println("0$i:0$j:$k")
                        }
                        if (i <=9 && j >9 && k <=9)
                        {
                            println("0$i:$j:0$k")
                        }
                        if (i <=9 && j >9 && k >9)
                        {
                            println("0$i:$j:$k")
                        }
                        if (i >9 && j <=9 && k <=9)
                        {
                            println("$i:0$j:0$k")
                        }
                        if (i >9 && j <=9 && k >9)
                        {
                            println("$i:0$j:$k")
                        }
                        if (i >9 && j >9 && k <=9)
                        {
                            println("$i:$j:0$k")
                        }
                        if (i >9 && j >9 && k >9)
                        {
                            println("$i:$j:$k")
                        }
                        Thread.sleep(1000)
                    }
                }

            }
        }
        else
        {
            for(j in 0 .. 59)
            {
                for (k in 0..59)
                {
                    if (i <=9 && j <=9 && k <=9)
                    {
                        println("0$i:0$j:0$k")
                    }
                    if (i <=9 && j <=9 && k >9)
                    {
                        println("0$i:0$j:$k")
                    }
                    if (i <=9 && j >9 && k <=9)
                    {
                        println("0$i:$j:0$k")
                    }
                    if (i <=9 && j >9 && k >9)
                    {
                        println("0$i:$j:$k")
                    }
                    if (i >9 && j <=9 && k <=9)
                    {
                        println("$i:0$j:0$k")
                    }
                    if (i >9 && j <=9 && k >9)
                    {
                        println("$i:0$j:$k")
                    }
                    if (i >9 && j >9 && k <=9)
                    {
                        println("$i:$j:0$k")
                    }
                    if (i >9 && j >9 && k >9)
                    {
                        println("$i:$j:$k")
                    }
                    Thread.sleep(1000)
                }
            }
        }

    }

}