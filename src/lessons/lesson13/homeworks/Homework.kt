package lessons.lesson13.homeworks

// 1. Среднее время выполнения теста (values)
fun averageTime(tests: Map<String, Int>): Double = tests.values.average()

// 2. Список тестовых методов (keys)
fun testMethods(metadata: Map<String, String>): Set<String> = metadata.keys

// 3. Добавление теста в изменяемый словарь (put)
fun addTest(results: MutableMap<String, String>, name: String, result: String) {
    results.put(name, result)
}

// 4. Количество успешных тестов (count)
fun countPassed(results: Map<String, String>): Int = results.count { it.value == "passed" }

// 5. Удаление исправленного бага (remove)
fun removeFixedBug(bugs: MutableMap<String, String>, bug: String) {
    bugs.remove(bug)
}

// 6. Сообщение о странице и статусе (entries + forEach)
fun printPages(pages: Map<String, Int>) {
    pages.entries.forEach { println("Страница ${it.key}: статус ${it.value}") }
}

// 7. Сервисы с временем ответа выше порога (filterValues)
fun slowServices(times: Map<String, Int>, threshold: Int): Map<String, Int> =
    times.filterValues { it > threshold }

// 8. Статус endpoint или "не тестировался" (getOrDefault)
fun endpointStatus(results: Map<String, String>, endpoint: String): String =
    results.getOrDefault(endpoint, "не тестировался")

// 9. Значение browserType, не null (getValue; бросает исключение, если ключа нет)
fun browserType(config: Map<String, String>): String = config.getValue("browserType")

// 10. Копия неизменяемого словаря с новой версией (toMutableMap)
fun addVersion(versions: Map<String, String>, name: String, version: String): Map<String, String> {
    val copy = versions.toMutableMap()
    copy[name] = version
    return copy
}

// 11. Настройки модели или по умолчанию (getOrElse)
fun deviceSettings(settings: Map<String, String>, model: String): String =
    settings.getOrElse(model) { "настройки по умолчанию" }

// 12. Есть ли код ошибки (containsKey)
fun hasErrorCode(errors: Map<Int, String>, code: Int): Boolean = errors.containsKey(code)

// 13. Сценарии определённой версии (filterKeys)
fun filterByVersion(scenarios: Map<String, String>, version: String): Map<String, String> =
    scenarios.filterKeys { it.contains(version) }

// 14. Есть ли модули с неудачным тестированием (containsValue)
fun hasFailedModules(modules: Map<String, String>): Boolean = modules.containsValue("failed")

// 15. Добавление настроек из другого словаря (putAll)
fun mergeSettings(target: MutableMap<String, String>, other: Map<String, String>) {
    target.putAll(other)
}

// 16. Объединение двух неизменяемых словарей (plus)
fun mergeBugs(first: Map<String, String>, second: Map<String, String>): Map<String, String> =
    first.plus(second)

// 17. Очистка изменяемого словаря (clear)
fun clearLastRun(data: MutableMap<String, String>) {
    data.clear()
}

// 18. Исключение пропущенных тестов (filterNot)
fun withoutSkipped(report: Map<String, String>): Map<String, String> =
    report.filterNot { it.value == "skipped" }

// 19. Копия без нескольких конфигураций (minus со списком ключей)
fun withoutConfigs(configs: Map<String, String>, keys: List<String>): Map<String, String> =
    configs.minus(keys)

// 20. Отчёт в виде списка строк (map)
fun makeReport(results: Map<String, String>): List<String> =
    results.map { "${it.key}: ${it.value}" }

// 21. Изменяемый словарь -> неизменяемый для архива (toMap)
fun archive(results: MutableMap<String, String>): Map<String, String> = results.toMap()

// 22. Идентификаторы теста -> строки (mapKeys)
fun idsToStrings(times: Map<Int, Double>): Map<String, Double> =
    times.mapKeys { it.key.toString() }

// 23. Увеличение оценок на 10% (mapValues)
fun increaseByTenPercent(scores: Map<String, Double>): Map<String, Double> =
    scores.mapValues { it.value * 1.1 }

// 24. Пуст ли словарь ошибок компиляции (isEmpty)
fun hasNoCompileErrors(errors: Map<String, String>): Boolean = errors.isEmpty()

// 25. Не пуст ли словарь результатов нагрузочного тестирования (isNotEmpty)
fun hasLoadResults(results: Map<String, String>): Boolean = results.isNotEmpty()

// 26. Прошли ли все тесты (all)
fun allPassed(results: Map<String, String>): Boolean = results.all { it.value == "passed" }

// 27. Есть ли хотя бы один тест с ошибкой (any)
fun anyFailed(results: Map<String, String>): Boolean = results.any { it.value == "failed" }

// 28. Не прошедшие тесты с "optional" в названии (filter)
fun failedOptional(results: Map<String, String>): Map<String, String> =
    results.filter { it.value != "passed" && it.key.contains("optional") }

fun main() {
    println("1: " + averageTime(mapOf("login" to 12, "search" to 20, "checkout" to 31)))
    println("2: " + testMethods(mapOf("loginTest" to "smoke", "searchTest" to "regression")))

    val results3 = mutableMapOf("login" to "passed")
    addTest(results3, "search", "failed")
    println("3: $results3")

    println("4: " + countPassed(mapOf("a" to "passed", "b" to "failed", "c" to "passed", "d" to "skipped")))

    val bugs5 = mutableMapOf("BUG-1" to "fixed", "BUG-2" to "open")
    removeFixedBug(bugs5, "BUG-1")
    println("5: $bugs5")

    printPages(mapOf("https://site.ru" to 200, "https://site.ru/missing" to 404))

    println("7: " + slowServices(mapOf("auth" to 120, "payments" to 480, "search" to 310), 300))

    val apiResults = mapOf("/login" to "200", "/search" to "500")
    println("8: " + endpointStatus(apiResults, "/login"))
    println("8: " + endpointStatus(apiResults, "/logout"))

    println("9: " + browserType(mapOf("browserType" to "chrome", "timeout" to "30")))

    val versions = mapOf("v1" to "1.0", "v2" to "1.1")
    println("10: " + addVersion(versions, "v3", "1.2") + ", исходный: $versions")

    val devices = mapOf("Pixel 7" to "1080x2400", "iPhone 15" to "1179x2556")
    println("11: " + deviceSettings(devices, "Pixel 7"))
    println("11: " + deviceSettings(devices, "Nokia"))

    val errors = mapOf(404 to "Not found", 500 to "Server error")
    println("12: " + hasErrorCode(errors, 500))
    println("12: " + hasErrorCode(errors, 403))

    println("13: " + filterByVersion(mapOf("T1_v1" to "Passed", "T2_v1" to "Failed", "T3_v2" to "Skipped"), "v1"))

    println("14: " + hasFailedModules(mapOf("auth" to "passed", "cart" to "failed")))

    val env15 = mutableMapOf("env" to "test")
    mergeSettings(env15, mapOf("browser" to "chrome", "timeout" to "30"))
    println("15: $env15")

    println("16: " + mergeBugs(mapOf("B1" to "open"), mapOf("B2" to "fixed")))

    val lastRun = mutableMapOf("t1" to "passed", "t2" to "failed")
    clearLastRun(lastRun)
    println("17: $lastRun")

    println("18: " + withoutSkipped(mapOf("t1" to "passed", "t2" to "skipped", "t3" to "failed")))

    println("19: " + withoutConfigs(mapOf("a" to "1", "b" to "2", "c" to "3", "d" to "4"), listOf("b", "d")))

    println("20: " + makeReport(mapOf("TC-1" to "passed", "TC-2" to "failed")))

    val lastResults = mutableMapOf("t1" to "passed")
    val archived = archive(lastResults)
    lastResults["t2"] = "failed"
    println("21: архив = $archived, текущие = $lastResults")

    println("22: " + idsToStrings(mapOf(1 to 1.5, 2 to 2.5)))

    println("23: " + increaseByTenPercent(mapOf("1.0" to 100.0, "1.1" to 200.0)))

    println("24: " + hasNoCompileErrors(emptyMap()))
    println("25: " + hasLoadResults(mapOf("load1" to "ok")))

    println("26: " + allPassed(mapOf("a" to "passed", "b" to "passed")))
    println("26: " + allPassed(mapOf("a" to "passed", "b" to "failed")))

    println("27: " + anyFailed(mapOf("a" to "passed", "b" to "failed")))

    println("28: " + failedOptional(mapOf(
        "login" to "passed",
        "optional_search" to "failed",
        "optional_theme" to "passed",
        "optional_chat" to "skipped"
    )))
}