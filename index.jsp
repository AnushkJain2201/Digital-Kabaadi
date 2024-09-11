<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
    <link rel="styleshet" href="style.css">
    <script src="https://cdn.tailwindcss.com"></script>
</head> 
<body>
    
<c:import url="header.jsp" />

    <div class="  border-color: rgb(125 211 252);">

   
    <section class="h-screen w-full  bg-no-repeat bg-[url('uploads/landing.jpg')] bg-dark  bg-cover">
        <div class="px-4 mx-auto max-w-screen-xl text-center py-24 lg:py-56">
            <h1 class="mb-4 text-4xl font-extrabold tracking-tight leading-none text-dark md:text-5xl lg:text-4xl text-top -mt-32">Don't Just Dream of a Clean India, Work for It!</h1>
            <p class="mb-8 text-lg font-bold text-dark lg:text-xl sm:px-16 lg:px-48">Swachh Bharat, Swasth Bharat.</p>
            <div class="flex flex-col space-y-4 sm:flex-row sm:justify-center sm:space-y-0">
                <a href="" class="inline-flex justify-center items-center py-3 px-5 text-base font-medium text-center text-white rounded-lg bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 dark:focus:ring-blue-900">
                    Get started
                    <svg class="w-3.5 h-3.5 ms-2 rtl:rotate-180" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 10">
                        <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M1 5h12m0 0L9 1m4 4L9 9"/>
                    </svg>
                </a>
                
            </div>
        </div>
    </section>
</div>
<body class="dark:bg-gray-900">
    <div class=" flex flex-row justify-evenly mt-8">
        
        <div>
            <a href="singup.do">
                <div
                    class="max-w-48 mt-8  bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                    <img class="rounded-t-lg " src="uploads/ip.png" alt="" />

                    <div class="p-5">

                        <h5
                            class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                            login as Industry Partner
                        </h5>
                    </div>
                </div>
            </a>
        </div>
        <div>
            <a href="singup.do">
                <div
                    class="max-w-48 mt-8  bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                    <img class="rounded-t-lg " src="uploads/seller.jpg" alt="" />

                    <div class="p-5">

                        <h5
                            class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                            login as Seller
                        </h5>
                    </div>
                </div>
            </a>
        </div>
        <div>
            <a href="singup.do">
                <div
                    class="max-w-48 mt-8 mr-10 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700 ">

                    <img class="rounded-t-lg " src="uploads/admin.webp" alt="" />

                    <div class="p-5">

                        <h5
                            class="mb-2 text-2xl font-bold tracking-tight text-gray-900 text-center dark:text-white">
                            login as Admin
                        </h5>
                    </div>
                </div>
            </a>
        </div>
        
    </div>
   
<c:import url="footer.jsp" />
  

</body>
</html>