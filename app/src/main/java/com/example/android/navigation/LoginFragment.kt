package com.example.android.navigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.android.navigation.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login, container, false)
        binding.login.setOnClickListener { loginCheck(it) }
        Log.i("TitleFragment","onCreateView called")
        return binding.root
    }

    /**companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }**/
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Title Fragment","onAttach is callled")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Title Fragment","onActivityCreated is callled")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Title Fragment","onViewCreated is callled")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Title Fragment","onStart is callled")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Title Fragment","onResume is callled")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Title Fragment","onPause is callled")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Title Fragment","onStop is callled")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Title Fragment","onDestroyView is callled")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Title Fragment","onDetach is callled")
    }

    private fun loginCheck(view : View){
        val username = getView()?.findViewById<EditText>(R.id.username)
        val password = getView()?.findViewById<EditText>(R.id.editTextTextPassword)

        if(username?.text.toString() == "Jugulanfu121" && password?.text.toString() == "hehehe123") {
            view.findNavController().navigate(R.id.action_loginFragment_to_titleFragment)
        }else{
            Toast.makeText(activity,"Login Error", Toast.LENGTH_LONG).show()
        }
    }
}