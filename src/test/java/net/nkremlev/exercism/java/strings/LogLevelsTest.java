package net.nkremlev.exercism.java.strings;

import net.nkremlev.exercism.java.strings.LogLevels;
import org.junit.jupiter.api.Test;

import static net.nkremlev.exercism.java.strings.LogLevels.message;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogLevelsTest {

    @Test
    public void message_with_leading_and_trailing_white_space() {
        assertEquals(message("[WARNING]:   \tTimezone not set  \r\n"), "Timezone not set");
    }

    @Test
    public void info_message() {
        assertEquals(LogLevels.message("[INFO]: File moved"), "File moved");
    }

    @Test
    public void error_message() {
        assertEquals(LogLevels.message("[ERROR]: Stack overflow"), "Stack overflow");
    }

    @Test
    public void reformat_with_leading_and_trailing_white_space() {
        assertEquals(LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"), "Corrupt disk (error)");
    }

    @Test
    public void info_log_level() {
        assertEquals(LogLevels.logLevel("[INFO]: Timezone changed"), "info");
    }

    @Test
    public void error_reformat() {
        assertEquals(LogLevels.reformat("[ERROR]: Segmentation fault"), "Segmentation fault (error)");
    }

    @Test
    public void error_log_level() {
        assertEquals(LogLevels.logLevel("[ERROR]: Disk full"), "error");
    }

    @Test
    public void info_reformat() {
        assertEquals(LogLevels.reformat("[INFO]: Disk defragmented"), "Disk defragmented (info)");
    }

    @Test
    public void warning_reformat() {
        assertEquals(LogLevels.reformat("[WARNING]: Decreased performance"), "Decreased performance (warning)");
    }

    @Test
    public void warning_log_level() {
        assertEquals(LogLevels.logLevel("[WARNING]: Unsafe password"), "warning");
    }

    @Test
    public void warning_message() {
        assertEquals(LogLevels.message("[WARNING]: Disk almost full"), "Disk almost full");
    }
}
