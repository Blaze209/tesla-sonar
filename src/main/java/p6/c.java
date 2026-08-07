package p6;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f101173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f101174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f101175k;

    @Deprecated
    public c(Context context, int i11, Cursor cursor, boolean z11) {
        super(context, cursor, z11);
        this.f101174j = i11;
        this.f101173i = i11;
        this.f101175k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p6.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f101175k.inflate(this.f101174j, viewGroup, false);
    }

    @Override // p6.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f101175k.inflate(this.f101173i, viewGroup, false);
    }
}
