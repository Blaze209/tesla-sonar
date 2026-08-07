package p024x1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010 \u001a\u00020\u00158&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020!8&X¦\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u0014\u0010(\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lx1/z;", "", "", "index", "Lw4/n;", "h", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Ljn0/h0;", "e", "(IIII)V", "g", "(I)Ljava/lang/Object;", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "", DateTokenConverter.CONVERTER_KEY, "()Z", "isVertical", "f", "mainAxisSizeWithSpacings", "a", "placeablesCount", "getNonScrollableItem", "c", "(Z)V", "nonScrollableItem", "Lw4/b;", "b", "()J", CryptoServicesPermission.CONSTRAINTS, "j", "lane", IntegerTokenConverter.CONVERTER_KEY, "span", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface z {
    int a();

    long b();

    void c(boolean z11);

    boolean d();

    void e(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight);

    int f();

    Object g(int index);

    int getIndex();

    Object getKey();

    long h(int index);

    int i();

    int j();
}
