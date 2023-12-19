/** @type {import('next').NextConfig} */
const nextConfig = {
  // Specified "rewrites" will not automatically work with "output: export"
  // output: 'export',
  reactStrictMode: true,

  // Preserve 'h-ref-ing' :=
  //skipTrailingSlashRedirect: true,

  // Employ 'dist' over 'out', alas to not confuse with other outputDirs' :=
  distDir: 'dist',

  images: {
    unoptimized: true
  },

  async rewrites()
  {
    return [{
      source: `/api/:path*`,
      destination: `/${process.env.NEXT_PUBLIC_URL}/:path*`
    }]
  }
}

module.exports = nextConfig
