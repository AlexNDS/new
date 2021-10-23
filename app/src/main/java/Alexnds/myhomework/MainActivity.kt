package Alexnds.myhomework


import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ClickMyBtn(view: android.view.View) {
        setContentView(R.layout.myscreen)
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun finishActivity(requestCode: Int) {
        super.finishActivity(requestCode)
    }}






