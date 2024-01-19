package com.example.basiccodelab.services

import com.example.basicscodelab.R


data class Superhero(val img: Int, val id: Int, val name: String, val information: String)

fun generateMockData(): List<Superhero> {
    val mockData = mutableListOf<Superhero>()

    mockData.add(
        Superhero(
            R.drawable.spider_man_4,
            1,
            "Spider-Man",
            "Peter Parker, the friendly neighborhood Spider-Man, swings through New York City with agility and grace. Blessed with incredible powers after being bitten by a radioactive spider, he embraces his responsibility to protect others. His quick-witted humor and relatable struggles make him a beloved character who captures the essence of being a hero."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.wolverine,
            2,
            "Wolverine",
            "Known for his adamantium claws and regenerative healing abilities, Wolverine is a fierce and relentless fighter. With a mysterious past and a gruff demeanor, he embodies the anti-hero archetype. Despite his rough exterior, Wolverine's loyalty to his friends and willingness to sacrifice himself for others sets him apart as a complex and captivating superhero."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.deadpool,
            3,
            "Deadpool",
            "Wade Wilson, better known as Deadpool, is an unconventional superhero who breaks the fourth wall with his sarcastic humor and irreverent antics. Armed with accelerated healing powers and exceptional combat skills, he takes on missions with a unique blend of wit and violence. Deadpool's unapologetic nature and ability to find humor in any situation make him a fan-favorite among comic book enthusiasts."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.thor,
            4,
            "Thor",
            "As the God of Thunder wielding Mjolnir, Thor brings epic battles and mythological elements to the Marvel universe. With his noble demeanor and immense strength, he protects both Earth and Asgard from various threats. Thor's larger-than-life personality combined with his unwavering sense of justice make him an iconic superhero worthy of admiration."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.ironman,
            5,
            "Iron Man",
            "Tony Stark's genius intellect and technological prowess allow him to don the powerful Iron Man suit. With a charismatic personality and a knack for witty banter, he fights against evil while maintaining a playboy billionaire persona. Iron Man's ability to adapt and overcome challenges with his advanced technology makes him an integral part of the superhero landscape."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.hulk,
            6,
            "Hulk",
            "Driven by anger and brute strength, Bruce Banner transforms into the Hulk, a green behemoth with unmatched power. As both a hero and a tragic figure, Hulk battles inner demons while smashing through any obstacle in his path. Hulk's raw power combined with his struggle for control creates a captivating character loved by fans who appreciate his unstoppable force."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.captainamerica,
            7,
            "Captain America",
            "Steve Rogers, the embodiment of patriotism and honor, leads the charge as Captain America. Endowed with superhuman strength and agility thanks to the Super-Soldier Serum, he stands up for justice and defends the weak. Captain America's unwavering moral compass and selfless dedication to his ideals make him a symbol of hope for fans worldwide."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.flash,
            8,
            "Flash",
            "Barry Allen, known as the Flash, possesses incredible speed that allows him to outrun any threat. With his red costume and lightning bolt emblem, he races through Central City to protect its citizens from danger. The Flash's lighthearted personality and ability to travel at supersonic speeds make him an electrifying hero who always saves the day in the blink of an eye."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.wonderwoman,
            9,
            "Wonder Woman",
            "Princess Diana of Themyscira, known as Wonder Woman, wields her lasso of truth and Amazonian strength in the fight for justice. With her iconic armor and compassion for humanity, she serves as an ambassador between worlds. Wonder Woman's fierce determination and unwavering belief in love's power make her an empowering symbol of female strength."
        )
    )
    mockData.add(
        Superhero(
            R.drawable.venom,
            10,
            "Venom",
            "Eddie Brock becomes Venom after bonding with an alien symbiote, resulting in a formidable anti-hero with incredible strength and shape-shifting abilities. Venom's dark and menacing appearance paired with his complex relationship between host and symbiote makes him an intriguing character who walks the line between good and evil."
        )
    )

    return mockData
}
