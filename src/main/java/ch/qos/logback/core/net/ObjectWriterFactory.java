package ch.qos.logback.core.net;

import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectWriterFactory {
    public AutoFlushingObjectWriter newAutoFlushingObjectWriter(OutputStream outputStream) {
        return new AutoFlushingObjectWriter(new ObjectOutputStream(outputStream), 70);
    }
}
