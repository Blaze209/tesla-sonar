package mi;

import ch.qos.logback.core.joran.action.ActionConst;
import ezvcard.property.Gender;
import java.io.Closeable;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H&¢\u0006\u0004\b)\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0%H&¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Lmi/f;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lmi/f$a;", "peek", "()Lmi/f$a;", "f", "()Lmi/f;", "e", "h", "j", "", "hasNext", "()Z", "", "L", "()Ljava/lang/String;", Gender.OTHER, "nextBoolean", "", "i1", "()Ljava/lang/Void;", "", "nextInt", "()I", "", "nextDouble", "()D", "", "nextLong", "()J", "Lmi/e;", "x1", "()Lmi/e;", "Ljn0/h0;", Gender.FEMALE, "()V", "", "names", "A3", "(Ljava/util/List;)I", "m", "", "getPath", "()Ljava/util/List;", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface f extends Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lmi/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "BEGIN_ARRAY", "END_ARRAY", "BEGIN_OBJECT", "END_OBJECT", "NAME", "STRING", "NUMBER", "LONG", "BOOLEAN", ActionConst.NULL, "END_DOCUMENT", "ANY", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum a {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        LONG,
        BOOLEAN,
        NULL,
        END_DOCUMENT,
        ANY
    }

    int A3(List<String> names);

    void F();

    String L();

    String O();

    f e();

    f f();

    List<Object> getPath();

    f h();

    boolean hasNext();

    Void i1();

    f j();

    void m();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    a peek();

    e x1();
}
