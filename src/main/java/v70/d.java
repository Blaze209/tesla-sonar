package v70;

import android.content.Context;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<a90.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f118141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f118142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<AddressElementActivityContract.Args> f118143c;

    public d(b bVar, Provider<Context> provider, Provider<AddressElementActivityContract.Args> provider2) {
        this.f118141a = bVar;
        this.f118142b = provider;
        this.f118143c = provider2;
    }

    public static d a(b bVar, Provider<Context> provider, Provider<AddressElementActivityContract.Args> provider2) {
        return new d(bVar, provider, provider2);
    }

    public static a90.b c(b bVar, Context context, AddressElementActivityContract.Args args) {
        return bVar.b(context, args);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a90.b get() {
        return c(this.f118141a, this.f118142b.get(), this.f118143c.get());
    }
}
