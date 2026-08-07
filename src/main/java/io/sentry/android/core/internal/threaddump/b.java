package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<? extends a> f79460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f79461b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f79462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79463d;

    public b(ArrayList<? extends a> arrayList) {
        this.f79460a = arrayList;
        this.f79462c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i11++;
            arrayList.add(new a(i11, line));
        }
    }

    public boolean a() {
        return this.f79463d < this.f79462c;
    }

    public a b() {
        int i11 = this.f79463d;
        if (i11 < this.f79461b || i11 >= this.f79462c) {
            return null;
        }
        ArrayList<? extends a> arrayList = this.f79460a;
        this.f79463d = i11 + 1;
        return arrayList.get(i11);
    }

    public void d() {
        this.f79463d--;
    }
}
