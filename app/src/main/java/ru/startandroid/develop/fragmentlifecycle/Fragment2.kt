package ru.startandroid.develop.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    val LOG_TAG = "myLogs"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_TAG, "Fragment2 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "Fragment2 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(LOG_TAG, "Fragment2 onCreateView")
        return inflater.inflate(R.layout.fragment2, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(LOG_TAG, "Fragment2 onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "Fragment2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "Fragment2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "Fragment2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "Fragment2 onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LOG_TAG, "Fragment2 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "Fragment2 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LOG_TAG, "Fragment2 onDetach")
    }
}