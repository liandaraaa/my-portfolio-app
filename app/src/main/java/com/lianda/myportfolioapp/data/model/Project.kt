package com.lianda.myportfolioapp.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Project(
    val images: MutableList<String>,
    val name: String
) : Parcelable

fun getAllProjects(): MutableList<Project> {
    return mutableListOf(
        Project(
            images = mutableListOf(
                "https://lh6.googleusercontent.com/vg8C00fhqPIrlVpl8x-un2Kf5o4Ri6_09bEL2cvoh2E3S-7vKFKTBCcKxaAPSPH1D-WEcjZSZ_zgqCXpHdQzLTOuymBSpyTy2BNx6K5S",
                "https://lh6.googleusercontent.com/kClvfGxZ4cUyVR_XSTH-EDT9oBgQ5iD4gfKNqNflbNvN5b8-SdB_BAbchwGVKyK42QIfdpMHxmDRbaxol9PjRuq7Hf-kHctL-uP8enOv",
                "https://lh5.googleusercontent.com/V5yOo23mQxR20O2crbuxdg3-s6UAySwN47KK5AdGwgtoQSYsGbTHHpm2t-cP7Xn1nvmqcTgcRZkbCm68DEdZIF3w9H3B6iRJl8N0siH4"
            ),
            name = "BISMA"
        ),
        Project(
            images = mutableListOf(
                "https://lh4.googleusercontent.com/LFBuPFWDcNZmvUFSKMwKhWe-XpyNgwYq4flLeS5oUkN4Ce6iKcElXg6mjeOzyt8ihYf7uhiTqroFwoQ0SXSmtkQ_FVWkzDNzzs9rertH",
                "https://lh3.googleusercontent.com/VblVNu0yFkbdRoAkTGplCnE07QmCm8K9NaclS-c0RexebNOm8O53gMzmRoz7zQSefu20WeQZTVoTdlWTAAjCMApXTNXa6cJwtfw3vNc6",
                "https://lh3.googleusercontent.com/ltRuadlwllXpTf3V2oKUAZdjX2WeumjNpTyjFyo-UCtj3xAYSGcxD9NA_3PZl94D54BjeGYhK3zzjaeGLjCbCplfRx3nJaoKH85-pPFA"
            ),
            name = "Nussa Rara"
        ),
        Project(
            images = mutableListOf(
                "https://lh3.googleusercontent.com/uBk2W0k4kAmOY4ZpHsIZfJ6jkXMXxLmSZQhtwp1EumSzNZWvvGJqVwdIBT6ygR-IoVZpxt2Z_WDPSnfEkUtbWN_UgzyiS3aguGwidcE",
                "https://lh5.googleusercontent.com/W_J9VSEj6cR-hg_7hSd95OQUL7fZ437rnO6sjtkoO0yX8Xb4_JqCl1cl2F6xnOh3vtPwSrZTmQqBaXZviWrwLDMcOkC0iTj5P1OnnO9l",
                "https://lh5.googleusercontent.com/mSJKgcDhf58CuDbptzFixpuau2uxPePcn-RSBzkKWK494NnGvFaTB9IZybVEaShd_kS-KEUsWql5PXqB7StnoxtwCL9oGrI4op8-rZH_"
            ),
            name = "Redkendi"
        ), Project(
            images = mutableListOf(
                "https://lh6.googleusercontent.com/6hzKA7M_hJwrGsBEl0unGcR_4KczdphlEhJLajw-_0aItEoRSvmIXxxGzC8JbJUfER0rZvotmzKsMtF4CzqLK90fZ_E4lxN9tOPwMbw79qM7yeU15BoTTXITpFGepuXeSTtIlJNY1_c",
                "https://lh6.googleusercontent.com/6zdFKipzQHYmm7NwD2p4I0YpXHnwIj6X0n2SCSr2pXy-5JEg6ndlcGoaaZ7G8DepaMKH0mPSeOWA4KywUeTG6nju_gMDczah6CP2BIoO",
                "https://lh5.googleusercontent.com/VH1baEjc8mSqLAeDTlWSU3Wi6d3PUnDBPmgS9L1s00RKYCzc4_8OqYDeeqDBxKjA3cJ3zapM8Us0oYAXX8FNiT7KaC9HmSvCKSc4I9T4"
            ),
            name = "UseeTV"
        ),
        Project(
            images = mutableListOf(
                "https://lh4.googleusercontent.com/92f6nlf_MmhX-G4PFMYyXnwbXXShJOejXO0Oe01jCtKiIQsZOLpzb5oXgvUIOWz9RnuIZJzaeRHN-S_yyyPgtKWfh5-hMA_ISoShECkE",
                "https://lh4.googleusercontent.com/30IOZhkpp-N81N3IhGfCOjc433SEOVRetdzoBIsNu1-4ZSXYcfCmIQ9AVxIlE7VJ5HoTBmqfOWP9zzIpl8tzzk4rVNxalyKRFsO9VkAH",
                "https://lh6.googleusercontent.com/Q1CrLYUE05ukGC0BKkMLrg2lLZ6wBKqU4THy5aTmRBvMDbTfNxIJwdXEYjVLyBFFVl53W2oy26A369fZDEyP_Mzm-HICmKNF2TLxNOvq",
                "https://lh3.googleusercontent.com/cM6fzokUmqpnHGIJCTq-oU5RbPH0JURZFc9QjGnZ1ICW_uC0swVerSjW3BKgPx5uLXd0oUeCEnyI1jB2he91wFWI-x5onCW4MFQ6AU2l"
            ),
            name = "Ciputra Water Meter"
        ),
        Project(
            images = mutableListOf(
                "https://lh6.googleusercontent.com/7x1ZjmQxvw2v_Iv3nIOqrOa1pF2gnOiRuayoZp6J7QYO92jf0SqMFbYsVp91g2yPGpTBwjrnnPTjhIwqzTAEMTY-qhiHpG3L6RnFcbIZXfsK_0AHVyyvxz8-CYXSGhhX95KYZh7et_o",
                "https://lh4.googleusercontent.com/Vf3v58ZXRGn3FcQkiQnUvkV3FYcZ2YZIOBy8JCg5TIL8lrN6QJQWLIXVlaoRPBA2vpSk6fboe8UYFVN0CaHKud8ei-doM2HkK0m22ers",
                "https://lh3.googleusercontent.com/vIOvosGJJfbWbDpKUfXRen7nvN3UyqmW2TtFK6B07mMfB7Oomof6YN0f9b_bn3pyHsNkddwg4yOhEzDIwChuTGLwlE4kKu8Saw8X4xJj",
                "https://lh3.googleusercontent.com/gi4qoC7MAt9-nd7XK3fOXf9IJEbjB69jqmEfV2QzCAoUcdJKQQhzRlCz2pJjhPgOqsqW6kBUdREbTA2vZz8fDjPy0B8Le3AzDDNGMvcB"
            ),
            name = "Ciputra Progress Field"
        ),
        Project(
            images = mutableListOf(
                "https://lh4.googleusercontent.com/7rHrWCTfX0BXUMUxtyBkCpFop0_neXa8JDs9S9GgO89JEiZpmPgFmqoNq0UKjzB5L2U_10StSmCEglBoAHNTwGdF99qG2plGICKpprIy",
                "https://lh5.googleusercontent.com/tLMnOi0Rua15UzNfp_fiqfNxHVFEKChEaptJ2sHgkIMu_yBMWDOaHrrNMrVy-0d1yqfNQQ8zVELoSqq9X7TP0j_6xJxbk4WAPWX2kFK0",
                "https://lh3.googleusercontent.com/qh1M1gWsUbZoweuVZoWPbW5LiBWlL4IGlvy2gvIK--6v8K-SOGvI0adVYvcXoRPTILsPFyJb0i2Ezd9c_3ZVglb8i7oD8Sqoyvh15oEe"
            ),
            name = "BITPI"
        ),
        Project(
            images = mutableListOf(
                "https://lh3.googleusercontent.com/TIEShAKaXsmFfIr7gk_mcd9S4jSrw7Yb44X0jbHtBSosXPtqeG3U5XfZH59kcql0TWqExoOsp_93J2Bdd7jmSBQK1RB-g7wjV0-8VJI",
                "https://lh6.googleusercontent.com/ZQSlCpT87bIhM9xREaa8fbJhWo3a-i_Z_GbDC9QSJjuwq_-WVvUjYt5TH_nnJdRGfUVUSv0UeLthICzkMTcBwA9XZLGJUzl2-kciH0lm",
                "https://lh6.googleusercontent.com/LU0ea4iefBlSmdLs7o-7R9uAxRogdtPvSgr2YIOWB0SSTDPjMwW9bSes2V-pCzxoH44cP2xiULfni-mm528xCe36oLom8nUuBKFDJWr4",
                "https://lh6.googleusercontent.com/eiv5-5dfp18in6sXbNKPHrUqvIRdZNG05uwXlKiroR8p0fbDG8FEaSv61CbciRrB3rIT2lJRKod_1W21WBH2jMgXqkJlZEOtOw0I3oFr"
            ),
            name = "Eazy Claim"
        )
    )
}