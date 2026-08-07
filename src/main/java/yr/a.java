package yr;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ou.e;
import ur.d;
import ur.g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f125780c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f125781a = e.f100000c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f125782b = e.f99999b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f125781a.decode(byteBuffer).toString();
            this.f125781a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f125781a.reset();
            byteBuffer.rewind();
            try {
                return this.f125782b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f125782b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f125781a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // ur.g
    protected ur.a b(d dVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new ur.a(new c(bArr, null, null));
        }
        Matcher matcher = f125780c.matcher(strC);
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
        return new ur.a(new c(bArr, str, str2));
    }
}
