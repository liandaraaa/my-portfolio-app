package com.lianda.myportfolioapp.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lianda.kecipirduplicateapp.utils.showImageUrl

import com.lianda.myportfolioapp.R
import com.lianda.myportfolioapp.data.model.User
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showUserProfile()
    }

    private fun showUserProfile() {
        val user = User()
        user.apply {
            imgProfile.showImageUrl(requireContext(), imageUrl, pbProfile)
            tvName.text = name
            tvPhone.text = phone
            tvEmail.text = email
            tvAddress.text = address
            tvInstagram.text = instagram
            tvLinkedin.text = linkedin
            tvGithub.text = github
        }
    }

}
