package mi;

import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import ezvcard.property.Gender;
import java.io.EOFException;
import java.util.List;
import okio.j;
import okio.k;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u0000 J2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0001H\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0015J\u0011\u00103\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010.J\u0011\u00105\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u001aJ\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010\u001aJ\u001d\u0010E\u001a\u00020\u00062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110CH\u0016¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010S\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\"R\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010YR\u0014\u0010b\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010\u001c¨\u0006e"}, d2 = {"Lmi/d;", "Lmi/f;", "Lokio/j;", "source", "<init>", "(Lokio/j;)V", "", "c", "()I", "C", "H", "", "", "o", "(C)Z", "Lokio/k;", "runTerminator", "", "t", "(Lokio/k;)Ljava/lang/String;", "B", "()Ljava/lang/String;", "Ljn0/h0;", "T", "(Lokio/k;)V", "b0", "()V", "newTop", "I", "(I)V", "throwOnEof", "p", "(Z)I", "n", "J", "()C", "message", "", "c0", "(Ljava/lang/String;)Ljava/lang/Void;", "f", "()Lmi/f;", "e", "h", "j", "hasNext", "()Z", "Lmi/f$a;", "peek", "()Lmi/f$a;", "L", Gender.OTHER, "nextBoolean", "i1", "()Ljava/lang/Void;", "", "nextDouble", "()D", "", "nextLong", "()J", "Lmi/e;", "x1", "()Lmi/e;", "nextInt", "close", Gender.FEMALE, "", "names", "A3", "(Ljava/util/List;)I", "", "getPath", "()Ljava/util/List;", "m", "a", "Lokio/j;", "Lokio/h;", "b", "Lokio/h;", "buffer", "peeked", DateTokenConverter.CONVERTER_KEY, "peekedLong", "peekedNumberLength", "Ljava/lang/String;", "peekedString", "", "g", "[I", "stack", "stackSize", "", IntegerTokenConverter.CONVERTER_KEY, "[Ljava/lang/String;", "pathNames", "pathIndices", "k", "indexStack", "l", "indexStackSize", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final k f92117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final k f92118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final k f92119p;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final okio.h buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int peeked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long peekedLong;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int peekedNumberLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String peekedString;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int[] stack;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String[] pathNames;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int[] pathIndices;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int[] indexStack;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int indexStackSize;

    static {
        k.Companion companion = k.INSTANCE;
        f92117n = companion.f("'\\");
        f92118o = companion.f("\"\\");
        f92119p = companion.f("{}[]:, \n\t\r/\\;#=");
    }

    public d(j source) {
        s.k(source, "source");
        this.source = source;
        this.buffer = source.l();
        int[] iArr = new int[256];
        iArr[0] = 6;
        this.stack = iArr;
        this.stackSize = 1;
        this.pathNames = new String[256];
        this.pathIndices = new int[256];
        int[] iArr2 = new int[256];
        iArr2[0] = 0;
        this.indexStack = iArr2;
        this.indexStackSize = 1;
    }

    private final String B() {
        long jD0 = this.source.d0(f92119p);
        return jD0 != -1 ? this.buffer.M0(jD0) : this.buffer.t1();
    }

    private final int C() throws EOFException {
        String str;
        String str2;
        int i11;
        byte bH = this.buffer.H(0L);
        if (bH == 116 || bH == 84) {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        } else if (bH == 102 || bH == 70) {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (bH != 110 && bH != 78) {
                return 0;
            }
            str = Address.ADDRESS_NULL_PLACEHOLDER;
            str2 = ActionConst.NULL;
            i11 = 7;
        }
        int length = str.length();
        for (int i12 = 1; i12 < length; i12++) {
            long j11 = i12;
            if (!this.source.request(1 + j11)) {
                return 0;
            }
            byte bH2 = this.buffer.H(j11);
            if (bH2 != ((byte) str.charAt(i12)) && bH2 != ((byte) str2.charAt(i12))) {
                return 0;
            }
        }
        long j12 = length;
        if (this.source.request(1 + j12) && o((char) this.buffer.H(j12))) {
            return 0;
        }
        this.buffer.skip(j12);
        this.peeked = i11;
        return i11;
    }

    private final int H() throws EOFException {
        long j11;
        int i11;
        boolean z11 = true;
        int i12 = 0;
        char c11 = 0;
        long j12 = 0;
        boolean z12 = false;
        while (true) {
            j11 = i12;
            if (!this.source.request(1 + j11)) {
                i11 = 0;
                break;
            }
            byte bH = this.buffer.H(j11);
            char c12 = (char) bH;
            i11 = 0;
            if (c12 == '-') {
                if (c11 != 0) {
                    if (c11 != 5) {
                        return 0;
                    }
                    c11 = 6;
                } else {
                    c11 = 1;
                    z12 = true;
                }
            } else if (c12 == '+') {
                if (c11 != 5) {
                    return 0;
                }
                c11 = 6;
            } else if (c12 == 'e' || c12 == 'E') {
                if (c11 != 2 && c11 != 4) {
                    return 0;
                }
                c11 = 5;
            } else if (c12 == '.') {
                if (c11 != 2) {
                    return 0;
                }
                c11 = 3;
            } else {
                if (bH < 48 || bH > 57) {
                    if (!o(c12)) {
                        break;
                    }
                    return 0;
                }
                if (c11 == 0 || c11 == 1) {
                    j12 = -(bH - 48);
                    c11 = 2;
                } else if (c11 != 2) {
                    if (c11 == 3) {
                        c11 = 4;
                    } else if (c11 == 5 || c11 == 6) {
                        c11 = 7;
                    }
                } else {
                    if (j12 == 0) {
                        return 0;
                    }
                    long j13 = (((long) 10) * j12) - ((long) (bH - 48));
                    z11 = (((j12 > (-922337203685477580L) ? 1 : (j12 == (-922337203685477580L) ? 0 : -1)) > 0) && z11) || (j12 == -922337203685477580L && j13 < j12);
                    j12 = j13;
                }
            }
            i12++;
        }
        if (c11 == 2 && z11 && (j12 != Long.MIN_VALUE || z12)) {
            if (!z12) {
                j12 = -j12;
            }
            this.peekedLong = j12;
            this.buffer.skip(j11);
            this.peeked = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i11;
        }
        this.peekedNumberLength = i12;
        this.peeked = 16;
        return 16;
    }

    private final void I(int newTop) {
        int i11 = this.stackSize;
        int[] iArr = this.stack;
        if (i11 != iArr.length) {
            this.stackSize = i11 + 1;
            iArr[i11] = newTop;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath());
        }
    }

    private final char J() throws EOFException {
        int i11;
        if (!this.source.request(1L)) {
            c0("Unterminated escape sequence");
            throw new KotlinNothingValueException();
        }
        char c11 = (char) this.buffer.readByte();
        if (c11 != 'u') {
            if (c11 == 't') {
                return '\t';
            }
            if (c11 == 'b') {
                return '\b';
            }
            if (c11 == 'n') {
                return '\n';
            }
            if (c11 == 'r') {
                return '\r';
            }
            if (c11 == 'f') {
                return '\f';
            }
            if (c11 == '\n' || c11 == '\'' || c11 == '\"' || c11 == '\\' || c11 == '/') {
                return c11;
            }
            c0("Invalid escape sequence: \\" + c11);
            throw new KotlinNothingValueException();
        }
        if (!this.source.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bH = this.buffer.H(i12);
            char c13 = (char) (c12 << 4);
            if (bH >= 48 && bH <= 57) {
                i11 = bH - 48;
            } else if (bH >= 97 && bH <= 102) {
                i11 = bH - 87;
            } else {
                if (bH < 65 || bH > 70) {
                    c0("\\u" + this.buffer.M0(4L));
                    throw new KotlinNothingValueException();
                }
                i11 = bH - 55;
            }
            c12 = (char) (c13 + i11);
        }
        this.buffer.skip(4L);
        return c12;
    }

    private final void T(k runTerminator) throws EOFException {
        while (true) {
            long jD0 = this.source.d0(runTerminator);
            if (jD0 == -1) {
                c0("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.H(jD0) != 92) {
                this.buffer.skip(jD0 + 1);
                return;
            } else {
                this.buffer.skip(jD0 + 1);
                J();
            }
        }
    }

    private final void b0() throws EOFException {
        long jD0 = this.source.d0(f92119p);
        okio.h hVar = this.buffer;
        if (jD0 == -1) {
            jD0 = hVar.getSize();
        }
        hVar.skip(jD0);
    }

    private final int c() throws EOFException {
        int[] iArr = this.stack;
        int i11 = this.stackSize;
        int i12 = iArr[i11 - 1];
        switch (i12) {
            case 1:
                iArr[i11 - 1] = 2;
                break;
            case 2:
                int iP = p(true);
                this.buffer.readByte();
                char c11 = (char) iP;
                if (c11 == ']') {
                    this.peeked = 4;
                    return 4;
                }
                if (c11 != ',') {
                    c0("Unterminated array");
                    throw new KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int iP2 = p(true);
                    this.buffer.readByte();
                    char c12 = (char) iP2;
                    if (c12 == '}') {
                        this.peeked = 2;
                        return 2;
                    }
                    if (c12 != ',') {
                        c0("Unterminated object");
                        throw new KotlinNothingValueException();
                    }
                }
                char cP = (char) p(true);
                if (cP == '\"') {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (cP != '}') {
                    c0("Unexpected character: " + cP);
                    throw new KotlinNothingValueException();
                }
                if (i12 == 5) {
                    c0("Expected name");
                    throw new KotlinNothingValueException();
                }
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            case 4:
                iArr[i11 - 1] = 5;
                int iP3 = p(true);
                this.buffer.readByte();
                if (((char) iP3) != ':') {
                    c0("Expected ':'");
                    throw new KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i11 - 1] = 7;
                break;
            case 7:
                if (p(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                c0("Malformed JSON");
                throw new KotlinNothingValueException();
            default:
                if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char cP2 = (char) p(true);
        if (cP2 == ']') {
            if (i12 != 1) {
                c0("Unexpected value");
                throw new KotlinNothingValueException();
            }
            this.buffer.readByte();
            this.peeked = 4;
            return 4;
        }
        if (cP2 == ';' || cP2 == ',' || cP2 == '\'') {
            c0("Unexpected value");
            throw new KotlinNothingValueException();
        }
        if (cP2 == '\"') {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (cP2 == '[') {
            this.buffer.readByte();
            this.peeked = 3;
            return 3;
        }
        if (cP2 == '{') {
            this.buffer.readByte();
            this.peeked = 1;
            return 1;
        }
        int iC = C();
        if (iC != 0) {
            return iC;
        }
        int iH = H();
        if (iH != 0) {
            return iH;
        }
        if (o((char) this.buffer.H(0L))) {
            c0("Malformed JSON");
            throw new KotlinNothingValueException();
        }
        c0("Expected value");
        throw new KotlinNothingValueException();
    }

    private final Void c0(String message) {
        throw new JsonEncodingException(message + " at path " + getPath());
    }

    private final String n() {
        return v.y0(getPath(), ".", null, null, 0, null, null, 62, null);
    }

    private final boolean o(char c11) {
        if (c11 != '/' && c11 != '\\' && c11 != ';' && c11 != '#' && c11 != '=') {
            return !(c11 == '{' || c11 == '}' || c11 == '[' || c11 == ']' || c11 == ':' || c11 == ',' || c11 == ' ' || c11 == '\t' || c11 == '\r' || c11 == '\n');
        }
        c0("Unexpected character: " + c11);
        throw new KotlinNothingValueException();
    }

    private final int p(boolean throwOnEof) throws EOFException {
        int i11 = 0;
        while (true) {
            long j11 = i11;
            if (!this.source.request(j11 + 1)) {
                if (throwOnEof) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i11++;
            byte bH = this.buffer.H(j11);
            if (bH != 9 && bH != 10 && bH != 13 && bH != 32) {
                this.buffer.skip(((long) i11) - 1);
                if (bH == 35) {
                    c0("Malformed JSON");
                    throw new KotlinNothingValueException();
                }
                if (bH != 47 || !this.source.request(2L)) {
                    return bH;
                }
                c0("Malformed JSON");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final String t(k runTerminator) throws EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jD0 = this.source.d0(runTerminator);
            if (jD0 == -1) {
                c0("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.H(jD0) != 92) {
                if (sb2 == null) {
                    String strM0 = this.buffer.M0(jD0);
                    this.buffer.readByte();
                    return strM0;
                }
                sb2.append(this.buffer.M0(jD0));
                this.buffer.readByte();
                String string = sb2.toString();
                s.j(string, "{\n        builder.append…uilder.toString()\n      }");
                return string;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.buffer.M0(jD0));
            this.buffer.readByte();
            sb2.append(J());
        }
    }

    @Override // mi.f
    public int A3(List<String> names) throws EOFException {
        s.k(names, "names");
        if (names.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String strL = L();
            int i11 = this.indexStack[this.indexStackSize - 1];
            if (s.f(names.get(i11), strL)) {
                int[] iArr = this.indexStack;
                int i12 = this.indexStackSize;
                iArr[i12 - 1] = i11 + 1;
                if (iArr[i12 - 1] == names.size()) {
                    this.indexStack[this.indexStackSize - 1] = 0;
                }
                return i11;
            }
            int i13 = i11;
            while (true) {
                i13++;
                if (i13 == names.size()) {
                    i13 = 0;
                }
                if (i13 == i11) {
                    break;
                }
                if (s.f(names.get(i13), strL)) {
                    int[] iArr2 = this.indexStack;
                    int i14 = this.indexStackSize;
                    iArr2[i14 - 1] = i13 + 1;
                    if (iArr2[i14 - 1] == names.size()) {
                        this.indexStack[this.indexStackSize - 1] = 0;
                    }
                    return i13;
                }
            }
            F();
        }
        return -1;
    }

    @Override // mi.f
    public void F() throws EOFException {
        int i11 = 0;
        do {
            Integer numValueOf = Integer.valueOf(this.peeked);
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            switch (numValueOf != null ? numValueOf.intValue() : c()) {
                case 1:
                    I(3);
                    i11++;
                    break;
                case 2:
                    this.stackSize--;
                    i11--;
                    break;
                case 3:
                    I(1);
                    i11++;
                    break;
                case 4:
                    this.stackSize--;
                    i11--;
                    break;
                case 8:
                case 12:
                    T(f92117n);
                    break;
                case 9:
                case 13:
                    T(f92118o);
                    break;
                case 10:
                case 14:
                    b0();
                    break;
                case 16:
                    this.buffer.skip(this.peekedNumberLength);
                    break;
            }
            this.peeked = 0;
        } while (i11 != 0);
        int[] iArr = this.pathIndices;
        int i12 = this.stackSize;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.pathNames[i12 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // mi.f
    public String L() throws EOFException {
        String strT;
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : c()) {
            case 12:
                strT = t(f92117n);
                break;
            case 13:
                strT = t(f92118o);
                break;
            case 14:
                strT = B();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + getPeekedToken() + " at path " + n());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strT;
        return strT;
    }

    @Override // mi.f
    public String O() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        String strValueOf = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.peekedLong);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = t(f92117n);
                    break;
                case 9:
                    strValueOf = t(f92118o);
                    break;
                case 10:
                    strValueOf = B();
                    break;
                case 11:
                    String str = this.peekedString;
                    if (str != null) {
                        this.peekedString = null;
                        strValueOf = str;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + getPeekedToken() + " at path " + n());
            }
        } else {
            strValueOf = this.buffer.M0(this.peekedNumberLength);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr[i11] = iArr[i11] + 1;
        return strValueOf;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.buffer.c();
        this.source.close();
    }

    @Override // mi.f
    public f e() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : c()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + n());
        }
        int i11 = this.stackSize;
        this.stackSize = i11 - 1;
        int[] iArr = this.pathIndices;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.peeked = 0;
        return this;
    }

    @Override // mi.f
    public f f() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : c()) == 3) {
            I(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + n());
    }

    @Override // mi.f
    public List<Object> getPath() {
        return ni.b.f95051a.a(this.stackSize, this.stack, this.pathNames, this.pathIndices);
    }

    @Override // mi.f
    public f h() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : c()) == 1) {
            I(3);
            this.peeked = 0;
            int i11 = this.indexStackSize;
            this.indexStackSize = i11 + 1;
            this.indexStack[i11] = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + n());
    }

    @Override // mi.f
    public boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    @Override // mi.f
    public Void i1() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : c()) == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + getPeekedToken() + " at path " + n());
    }

    @Override // mi.f
    public f j() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : c()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + getPeekedToken() + " at path " + n());
        }
        int i11 = this.stackSize;
        int i12 = i11 - 1;
        this.stackSize = i12;
        this.pathNames[i12] = null;
        int[] iArr = this.pathIndices;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.peeked = 0;
        this.indexStackSize--;
        return this;
    }

    @Override // mi.f
    public void m() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // mi.f
    public boolean nextBoolean() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        if (iIntValue == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iIntValue == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i12 = this.stackSize - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + getPeekedToken() + " at path " + n());
    }

    @Override // mi.f
    public double nextDouble() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        if (iIntValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.peekedLong;
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M0(this.peekedNumberLength);
        } else if (iIntValue == 9) {
            this.peekedString = t(f92118o);
        } else if (iIntValue == 8) {
            this.peekedString = t(f92117n);
        } else if (iIntValue == 10) {
            this.peekedString = B();
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a double but was " + getPeekedToken() + " at path " + n());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            s.h(str);
            double d11 = Double.parseDouble(str);
            if (Double.isNaN(d11) || Double.isInfinite(d11)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d11 + " at path " + n());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i12 = this.stackSize - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return d11;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + n());
        }
    }

    @Override // mi.f
    public int nextInt() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        if (iIntValue == 15) {
            long j11 = this.peekedLong;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i12 = this.stackSize - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M0(this.peekedNumberLength);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strT = t(iIntValue == 9 ? f92118o : f92117n);
            this.peekedString = strT;
            try {
                s.h(strT);
                int i13 = Integer.parseInt(strT);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i14 = this.stackSize - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected an int but was " + getPeekedToken() + " at path " + n());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            s.h(str);
            double d11 = Double.parseDouble(str);
            int i15 = (int) d11;
            if (i15 == d11) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i16 = this.stackSize - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + n());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + n());
        }
    }

    @Override // mi.f
    public long nextLong() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : c();
        if (iIntValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.peekedLong;
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M0(this.peekedNumberLength);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strT = t(iIntValue == 9 ? f92118o : f92117n);
            this.peekedString = strT;
            try {
                s.h(strT);
                long j11 = Long.parseLong(strT);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i12 = this.stackSize - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a long but was " + getPeekedToken() + " at path " + n());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            s.h(str);
            double d11 = Double.parseDouble(str);
            long j12 = (long) d11;
            if (j12 == d11) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return j12;
            }
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + n());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + n());
        }
    }

    @Override // mi.f
    /* JADX INFO: renamed from: peek */
    public f.a getPeekedToken() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : c()) {
            case 1:
                return f.a.BEGIN_OBJECT;
            case 2:
                return f.a.END_OBJECT;
            case 3:
                return f.a.BEGIN_ARRAY;
            case 4:
                return f.a.END_ARRAY;
            case 5:
            case 6:
                return f.a.BOOLEAN;
            case 7:
                return f.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return f.a.STRING;
            case 12:
            case 13:
            case 14:
                return f.a.NAME;
            case 15:
                return f.a.LONG;
            case 16:
                return f.a.NUMBER;
            case 17:
                return f.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // mi.f
    public e x1() throws EOFException {
        String strO = O();
        s.h(strO);
        return new e(strO);
    }
}
