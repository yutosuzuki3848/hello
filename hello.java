{\rtf1\ansi\ansicpg932\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset204 Helvetica;\f1\fnil\fcharset128 HiraginoSans-W3;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Main \{\
  public static void main(String[] args) \{\
    // 
\f1 \'95\'cf\'90\'94
\f0 numbers
\f1 \'82\'c9\'81\'41\'97\'5e\'82\'a6\'82\'e7\'82\'ea\'82\'bd\'90\'94\'8e\'9a\'82\'cc\'94\'7a\'97\'f1\'82\'f0\'91\'e3\'93\'fc\'82\'b5\'82\'c4\'82\'ad\'82\'be\'82\'b3\'82\'a2
\f0 \
    int numbers[]=\{1, 4, 6, 9, 13, 16\};\
    \
    int oddSum = 0;\
    int evenSum = 0;\
    \
    // for
\f1 \'95\'b6\'82\'f0\'97\'70\'82\'a2\'82\'c4\'81\'41\'94\'7a\'97\'f1
\f0 numbers
\f1 \'82\'cc\'8b\'f4\'90\'94\'82\'cc\'98\'61\'82\'c6\'8a\'ef\'90\'94\'82\'cc\'98\'61\'82\'f0\'8b\'81\'82\'df\'82\'c4\'82\'ad\'82\'be\'82\'b3\'82\'a2
\f0 \
    for (int number : numbers)\{\
      if(number % 2 ==0 )\{\
        evenSum += number;\
      \}else\{\
        oddSum += number;\
      \}\
    \}\
\
    System.out.println("
\f1 \'8a\'ef\'90\'94\'82\'cc\'98\'61\'82\'cd
\f0 " + oddSum + "
\f1 \'82\'c5\'82\'b7
\f0 ");\
    System.out.println("
\f1 \'8b\'f4\'90\'94\'82\'cc\'98\'61\'82\'cd
\f0 " + evenSum + "
\f1 \'82\'c5\'82\'b7
\f0 ");\
  \}\
\}\
}