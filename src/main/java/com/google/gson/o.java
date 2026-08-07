package com.google.gson;

import bx.h0;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    public static l a(ex.a aVar) {
        u uVarH = aVar.H();
        if (uVarH == u.LEGACY_STRICT) {
            aVar.w0(u.LENIENT);
        }
        try {
            try {
                l lVarA = h0.a(aVar);
                aVar.w0(uVarH);
                return lVarA;
            } catch (Throwable th2) {
                aVar.w0(uVarH);
                throw th2;
            }
        } catch (OutOfMemoryError | StackOverflowError e11) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e11);
        }
    }

    public static l b(Reader reader) {
        try {
            ex.a aVar = new ex.a(reader);
            l lVarA = a(aVar);
            if (!lVarA.h() && aVar.n0() != ex.b.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return lVarA;
        } catch (MalformedJsonException | NumberFormatException e11) {
            throw new JsonSyntaxException(e11);
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        }
    }

    public static l c(String str) {
        return b(new StringReader(str));
    }
}
