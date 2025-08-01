package com.varabyte.kobweb.compose.ui.modifiers

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.styleModifier

fun Modifier.listStyle(listStyle: ListStyle) = styleModifier {
    listStyle(listStyle)
}

fun Modifier.listStyle(
    type: ListStyleType? = null,
    position: ListStylePosition? = null,
    image: ListStyleImage? = null
) = styleModifier {
    listStyle(ListStyle.of(type, position, image))
}
