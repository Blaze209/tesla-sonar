package p6;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import expo.modules.contacts.Columns;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, p6.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f101162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f101163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f101164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f101165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f101166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C2148a f101167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f101168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.b f101169h;

    /* JADX INFO: renamed from: p6.a$a, reason: collision with other inner class name */
    private class C2148a extends ContentObserver {
        C2148a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f101162a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f101162a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z11) {
        e(context, cursor, z11 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // p6.b.a
    public Cursor b() {
        return this.f101164c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i11) {
        if ((i11 & 1) == 1) {
            i11 |= 2;
            this.f101163b = true;
        } else {
            this.f101163b = false;
        }
        boolean z11 = cursor != null;
        this.f101164c = cursor;
        this.f101162a = z11;
        this.f101165d = context;
        this.f101166e = z11 ? cursor.getColumnIndexOrThrow(Columns.ID) : -1;
        if ((i11 & 2) == 2) {
            this.f101167f = new C2148a();
            this.f101168g = new b();
        } else {
            this.f101167f = null;
            this.f101168g = null;
        }
        if (z11) {
            C2148a c2148a = this.f101167f;
            if (c2148a != null) {
                cursor.registerContentObserver(c2148a);
            }
            DataSetObserver dataSetObserver = this.f101168g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f101162a || (cursor = this.f101164c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f101162a) {
            return null;
        }
        this.f101164c.moveToPosition(i11);
        if (view == null) {
            view = f(this.f101165d, this.f101164c, viewGroup);
        }
        d(view, this.f101165d, this.f101164c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f101169h == null) {
            this.f101169h = new p6.b(this);
        }
        return this.f101169h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        Cursor cursor;
        if (!this.f101162a || (cursor = this.f101164c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f101164c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        Cursor cursor;
        if (this.f101162a && (cursor = this.f101164c) != null && cursor.moveToPosition(i11)) {
            return this.f101164c.getLong(this.f101166e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f101162a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f101164c.moveToPosition(i11)) {
            if (view == null) {
                view = g(this.f101165d, this.f101164c, viewGroup);
            }
            d(view, this.f101165d, this.f101164c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i11);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f101163b || (cursor = this.f101164c) == null || cursor.isClosed()) {
            return;
        }
        this.f101162a = this.f101164c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f101164c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2148a c2148a = this.f101167f;
            if (c2148a != null) {
                cursor2.unregisterContentObserver(c2148a);
            }
            DataSetObserver dataSetObserver = this.f101168g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f101164c = cursor;
        if (cursor == null) {
            this.f101166e = -1;
            this.f101162a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C2148a c2148a2 = this.f101167f;
        if (c2148a2 != null) {
            cursor.registerContentObserver(c2148a2);
        }
        DataSetObserver dataSetObserver2 = this.f101168g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f101166e = cursor.getColumnIndexOrThrow(Columns.ID);
        this.f101162a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
