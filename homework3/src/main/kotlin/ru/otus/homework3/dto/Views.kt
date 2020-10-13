package ru.otus.homework3.dto

interface Views {
    interface General
    interface Write : General
    interface Read : Write
}