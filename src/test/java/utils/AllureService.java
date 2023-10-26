package utils;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import lombok.SneakyThrows;

import java.io.File;

public class AllureService {
    @Attachment(type = "image/png")
    @SneakyThrows
    public byte[] screenshot() {
        File screenshot;
        screenshot = Screenshots.takeScreenShotAsFile();
        return screenshot == null ? null : Files.toByteArray(screenshot);
    }
}