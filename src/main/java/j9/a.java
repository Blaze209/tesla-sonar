package j9;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f83116c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f83117a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f83118b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f83117a.decode(byteBuffer).toString();
            this.f83117a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f83117a.reset();
            byteBuffer.rewind();
            try {
                return this.f83118b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f83118b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f83117a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // f9.c
    protected f0 b(f9.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new f0(new c(bArr, null, null));
        }
        Matcher matcher = f83116c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = ou.c.e(strGroup);
                strE.getClass();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new f0(new c(bArr, str, str2));
    }
}
