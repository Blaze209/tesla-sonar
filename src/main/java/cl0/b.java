package cl0;

import bl0.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import jn0.h0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\u0005\r\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcl0/b;", "", "<init>", "()V", "Lbl0/c;", "b", "()Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "a", "()Ljava/lang/Long;", "contentLength", "Lbl0/k;", "c", "()Lbl0/k;", "headers", DateTokenConverter.CONVERTER_KEY, "Lcl0/b$a;", "Lcl0/b$b;", "Lcl0/b$c;", "Lcl0/b$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcl0/b$a;", "Lcl0/b;", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "()[B", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a extends b {
        public a() {
            super(null);
        }

        public abstract byte[] d();
    }

    /* JADX INFO: renamed from: cl0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl0/b$b;", "Lcl0/b;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AbstractC0400b extends b {
        public AbstractC0400b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcl0/b$c;", "Lcl0/b;", "<init>", "()V", "Lio/ktor/utils/io/g;", DateTokenConverter.CONVERTER_KEY, "()Lio/ktor/utils/io/g;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c extends b {
        public c() {
            super(null);
        }

        public abstract g d();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcl0/b$d;", "Lcl0/b;", "<init>", "()V", "Lio/ktor/utils/io/j;", "channel", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lio/ktor/utils/io/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class d extends b {
        public d() {
            super(null);
        }

        public abstract Object d(j jVar, Continuation<? super h0> continuation);
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Long a() {
        return null;
    }

    public bl0.c b() {
        return null;
    }

    public k c() {
        return k.INSTANCE.a();
    }

    private b() {
    }
}
