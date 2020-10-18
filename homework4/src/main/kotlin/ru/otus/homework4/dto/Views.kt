package ru.otus.homework4.dto

interface Views {
    interface General
    interface Write : General
    interface Read : Write
}