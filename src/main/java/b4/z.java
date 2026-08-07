package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001c\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lb4/z;", "", "<init>", "()V", "other", "Ljn0/h0;", "b", "(Lb4/z;)V", "Landroidx/compose/ui/graphics/c;", "scope", "a", "(Landroidx/compose/ui/graphics/c;)V", "", "c", "(Lb4/z;)Z", "", Gender.FEMALE, "scaleX", "scaleY", "translationX", DateTokenConverter.CONVERTER_KEY, "translationY", "e", "rotationX", "f", "rotationY", "g", "rotationZ", "h", "cameraDistance", "Landroidx/compose/ui/graphics/f;", IntegerTokenConverter.CONVERTER_KEY, "J", "transformOrigin", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();

    public final void a(androidx.compose.ui.graphics.c scope) {
        this.scaleX = scope.O();
        this.scaleY = scope.R();
        this.translationX = scope.A();
        this.translationY = scope.z();
        this.rotationX = scope.Q();
        this.rotationY = scope.H();
        this.rotationZ = scope.J();
        this.cameraDistance = scope.t();
        this.transformOrigin = scope.h1();
    }

    public final void b(z other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final boolean c(z other) {
        return this.scaleX == other.scaleX && this.scaleY == other.scaleY && this.translationX == other.translationX && this.translationY == other.translationY && this.rotationX == other.rotationX && this.rotationY == other.rotationY && this.rotationZ == other.rotationZ && this.cameraDistance == other.cameraDistance && androidx.compose.ui.graphics.f.e(this.transformOrigin, other.transformOrigin);
    }
}
