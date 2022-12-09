package com.example.cvbuilderapp.ui.contact

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.WebActivity


class ContactFragment : Fragment(R.layout.fragment_contact), OnClickListener {

    private lateinit var phoneLL: LinearLayout
    private lateinit var emailLL: LinearLayout
    private lateinit var linkedInLL: LinearLayout
    private lateinit var githubLL: LinearLayout
    private lateinit var resumeLL: LinearLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        phoneLL = view.findViewById(R.id.mobile_contact)
        emailLL = view.findViewById(R.id.email_contact)
        linkedInLL = view.findViewById(R.id.linkedin_contact)
        githubLL = view.findViewById(R.id.github_contact)
        resumeLL = view.findViewById(R.id.resume_contact)

        phoneLL.setOnClickListener(this)
        emailLL.setOnClickListener(this)
        linkedInLL.setOnClickListener(this)
        githubLL.setOnClickListener(this)
        resumeLL.setOnClickListener(this)

    }

    private fun onPhoneClicked() {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+1(641)819-2477"))
        context?.startActivity(intent)
    }

    private fun onEmailContactClicked() {
        sendEmail()
    }

    private fun onLinkedInContactClicked() {
        openWebUrl(getString(R.string.linkedin_profile))
    }

    private fun onGithubContactClicked() {
        openWebUrl(getString(R.string.github_profile))
    }

    private fun onResumeClicked() {

    }

    private fun openWebUrl(url: String) {
        val intent = Intent(requireActivity(), WebActivity::class.java)
        intent.putExtra("url",url)
        requireContext().startActivity(intent)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.mobile_contact -> onPhoneClicked()
            R.id.email_contact -> onEmailContactClicked()
            R.id.linkedin_contact -> onLinkedInContactClicked()
            R.id.github_contact -> onGithubContactClicked()
            R.id.resume_contact -> onResumeClicked()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ContactFragment()
    }


    private fun sendEmail() {
        val isAppInstalled: Boolean = isAppAvailable("com.google.android.gm")
        if (isAppInstalled) {
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.data = (Uri.parse("mailto:" + getString(R.string.email)))
            myIntent.type = "text/plain"
            myIntent.setPackage("com.google.android.gm")
            myIntent.putExtra(Intent.EXTRA_EMAIL, getString(R.string.email))
            startActivity(Intent.createChooser(myIntent, "Share with"))
        } else {
            Toast.makeText(requireContext(), "App not Installed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isAppAvailable(appName: String?): Boolean {
        return try {
            requireContext().packageManager.getPackageInfo(appName!!, PackageManager.GET_ACTIVITIES)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

}