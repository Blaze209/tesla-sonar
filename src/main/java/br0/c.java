package br0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f17952a = Logger.getLogger("org.jmrtd");

    public abstract void a(OutputStream outputStream);

    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            f17952a.log(Level.WARNING, "Exception: ", (Throwable) e11);
            return null;
        }
    }
}
