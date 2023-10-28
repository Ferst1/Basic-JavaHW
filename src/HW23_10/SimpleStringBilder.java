package HW23_10;
//Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//
//1) Берем исходную строку с данными из cars
//{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
//Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';
public class SimpleStringBilder {
    public static void main(String[] args) {
        String[] data = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", "null", "active", "true"};
        String tableName = "cars";
        String sqlQuery = generateSQLQuery(data, tableName);
        System.out.println(sqlQuery);
    }
    public static String generateSQLQuery(String[] data, String tableName) {
        if (data.length % 2 != 0) {
            throw new IllegalArgumentException("Неправильное количество параметров в массиве данных");
        }

        StringBuilder query = new StringBuilder("SELECT * FROM ");
        query.append(tableName);
        query.append(" WHERE ");

        for (int i = 0; i < data.length; i += 2) {
            String paramName = data[i];
            String paramValue = String.valueOf(data[i + 1]);

            if (paramValue.equals("null")) {
                continue; // Пропустить параметры со значением null
            }

            if (i > 0) {
                query.append(" AND ");
            }

            query.append(paramName);
            query.append(" = '");
            query.append(paramValue);
            query.append("'");
        }

        return query.toString();
    }


}
