package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f82189d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f82191c;

    public static t P(String str, boolean z11) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i11 == 0) && ((cCharAt < '0' || cCharAt > '9' || i11 == 0) && ((cCharAt != '~' || i11 == 0) && ((cCharAt != '.' || i11 == 0) && ((cCharAt != '_' || i11 == 0) && ((cCharAt != '+' || i11 == 0) && (cCharAt != '-' || i11 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e11) {
                if (z11) {
                    throw e11;
                }
                fVarA = null;
            }
            return new t(str, fVarA);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public t(String str, j$.time.zone.f fVar) {
        this.f82190b = str;
        this.f82191c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String m() {
        return this.f82190b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f s() {
        j$.time.zone.f fVar = this.f82191c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f82190b);
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void J(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f82190b);
    }
}
