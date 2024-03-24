package exercise;
import com.fasterxml.jackson.databind.ObjectMapper;
import oop.FileKV;
import oop.KeyValueStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);
    }

    // BEGIN
    @Test
    public void FileKVTest() {
        KeyValueStorage file = new FileKV("src/test/resources/file", Map.of());
        file.set("key", "value");
        file.set("key2", "value2");

        assertThat(file.get("key", "default")).isEqualTo("value");
        assertThat(file.get("key2", "default")).isEqualTo("value2");

        file.unset("key");

        assertThat(file.get("key", "default")).isEqualTo("default");
        assertThat(file.toMap()).isEqualTo(Map.of("key2", "value2"));
        // END
    }
}
